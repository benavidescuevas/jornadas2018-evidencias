'use strict';

var votes = new Map();

exports.deleteVotes = function(args, res, next) {

  var talkId = args.talkId.value;

  if (!votes.has(talkId))
    res.end();

  votes.set(talkId, new Array());
  res.end();

}

exports.getResults = function(args, res, next) {

  var talkId = args.talkId.value;
  
  var results = {
    count: 0,
    average: 0
  };

  if (votes.has(talkId)) {
    var talkVotes = votes.get(talkId);

    results.count = talkVotes.length;

    if (talkVotes.length > 0)
      results.average = talkVotes.reduce((r, n) => { return r + n; }) / talkVotes.length;
  }
  
  res.setHeader('Content-Type', 'application/json');
  res.end(JSON.stringify(results, null, 2));

}

exports.registerVote = function(args, res, next) {

  var talkId = args.talkId.value;
  var vote = args.vote.value;

  if (!votes.has(talkId))
    votes.set(talkId, new Array());

  var talkVotes = votes.get(talkId);

  talkVotes.push(vote);

  res.end();
}
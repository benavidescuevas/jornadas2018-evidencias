'use strict'

var vartalkVotesController = require('./talkVotesControllerService');

module.exports.registerVote = function registerVote(req, res, next) {
  vartalkVotesController.registerVote(req.swagger.params, res, next);
};

module.exports.deleteVotes = function deleteVotes(req, res, next) {
  vartalkVotesController.deleteVotes(req.swagger.params, res, next);
};

module.exports.getResults = function getResults(req, res, next) {
  vartalkVotesController.getResults(req.swagger.params, res, next);
};
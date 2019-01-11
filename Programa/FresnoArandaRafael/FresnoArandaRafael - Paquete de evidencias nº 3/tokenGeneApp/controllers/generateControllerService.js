'use strict'

var jwt = require('jsonwebtoken');

module.exports.generateToken = function generateToken(req, res, next) {
  var key = req.query.key;
  var payload = {};
  payload.iss = req.query.issuer;
  if (req.query.role) {
    payload.role = req.query.role;
  }
  if (req.query.sampleId) {
    payload.sampleId = req.query.sampleId;
  }
  var token = jwt.sign(payload, key);
  res.send({
    token: token
  });
};
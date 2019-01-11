'use strict'

var vargenerateController = require('./generateControllerService');

module.exports.generateToken = function generateToken(req, res, next) {
  vargenerateController.generateToken(req, res, next);
};
#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from flask import Flask, request

app = Flask(__name__)
app.config['JSON_AS_ASCII'] = False
db = {'ranking': []}


@app.route("/", methods=['POST'])
def post():
    payload = request.get_json()
    db['ranking'] = payload['ranking']
    return {}, 200


@app.route("/sample", methods=['GET'])
def get_test():
    resp = {
        'ranking': [
            {
                'team_name': "foo",
                'max_distance': 6.28
            },
            {
                'team_name': "bar",
                'max_distance': 5.14
            },
            {
                'team_name': "beginner",
                'max_distance': 0
            }
        ]
    }
    return resp, 200


@app.route("/", methods=['GET'])
def get():
    return db, 200


if __name__ == '__main__':
    app.run()

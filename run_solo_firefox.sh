#!/bin/bash
sbt -Dbrowser=firefox 'test-only utils.SerenityPOCRunner'

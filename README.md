# KinesisProducer
Example project utilising spring-cloud-starter-stream-kinesis

On startup this project will attempt to create a Kinesis Stream called test_stream on AWS Kinesis. 

The project can be tested by posting messages to 

curl -X POST \
  http://localhost:64398/ \
  -H 'authorization: Basic xxxxxxxxxxxxxxxxxxxxxxxxxxxx' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{"name":"pen"}'

The applicaiton should place this message on the stream and also pick it back up recordign the fact in the logs.

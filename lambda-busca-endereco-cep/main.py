from cep_client import buscar_endereco
import json

def lambda_handler(event, context):
    print(event)
    event_body = json.loads(event['body'])
    endereco = buscar_endereco(event_body['cep'])

    return {
        'statusCode': 200,
        'body': json.dumps(endereco.to_dict(), ensure_ascii=False)
    }
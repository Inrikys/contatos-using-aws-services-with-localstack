Siga o passo a passo via powershell

Instalar dependencias  
pip install -r requirements.txt -t .

Zipa o Lambda:  
Compress-Archive -Path * -DestinationPath function.zip -Force

Cria o Lambda  
aws --endpoint-url=http://localhost:4566 lambda create-function `  
    --function-name buscar-endereco-cep `  
    --runtime python3.13 `  
    --handler main.lambda_handler `   
    --role arn:aws:iam::000000000000:role/lambda-role `   
    --zip-file fileb://function.zip

Invoca o Lambda  
aws --endpoint-url=http://localhost:4566 lambda invoke `  
    --function-name buscar-endereco-cep `  
    --payload fileb://event.json `  
    response.json  
# 

## Model
www.msaez.io/#/65219386/storming/%ED%9C%B4%EB%8C%80%ED%8F%B0%EB%B6%84%EC%8B%A4%EC%8B%A0%EA%B3%A0

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- lostphone
- phonemanagement
- tempphonemanagement


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- lostphone
```
 http :8088/lossmanagements id="id"reportDate="report-date"phoneModel="phone-model"status="status"userName="user-name"userId="userId"
```
- phonemanagement
```
 http :8088/phonemanagements id="id"userId="userId"status="status"deviceId="device-id"reportDate="report-date"
```
- tempphonemanagement
```
 http :8088/rentalPhones id="id"userId="userId"rentalStartDate="rental-start-date"rentalEndDate="rental-end-date"status="status"deviceId="device-id"
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

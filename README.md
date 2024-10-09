# FleetDryRun_postGreSQL_springBoot_JSONB_v1
Task on converting the JsonB to VARCHAR datatype in the database and inserting and retrieving the data

POST CURL >
>
curl --location 'http://localhost:8080/api/data' \
--header 'Content-Type: application/json' \
--data '{
  "id": "Student3",
  "admitYear": "2024",
  "address": {
    "postCode": "456789",
    "city": "Mysuru"
  }
}'
>
GET CURL >

curl --location 'http://localhost:8080/api/data' 

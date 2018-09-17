# bankapp
Rest Link for bankApp

1. [post] http://localhost:8080/api/register

{
"userName":"ankur",
"passWord":"1234"
}


2. [post] http://localhost:8080/api/login

{
"userName":"ankur",
"passWord":"1234"
}


3. [get] http://localhost:8080/api/getbanklist

4. [get] http://localhost:8080/api/getbankdata?bankName=HDFC

5. [POST] http://localhost:8080/api/logintobank?bankName=HDFC

{
"userName":"ankur",
"passWord":"1234",
"corpId":"00101"
}


6. [GET] http://localhost:8080/api/getaccounts?bankName=HDFC

7. [get] http://localhost:8080/api/gettransactiondata?accnumber=10102321456

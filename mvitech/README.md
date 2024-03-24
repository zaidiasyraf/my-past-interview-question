
# MVI Interview answer

Can find the question here https://github.com/zaidiasyraf/mvitech/blob/7c95a1ad11a693e70059ccae7e9f18f57e4339be/Qns%2017-18_Set%205_Experienced.pdf

The answer will be in spring boot app where user can upload the test file to designated endpoint

Can find the test file here https://github.com/zaidiasyraf/mvitech/blob/8717699a133e5c93b202bd5c8bc5fe11e0ca2f87/test.txt

Dependencies
1. java 1.8
2. maven

## How to run

#### Run from terminal

```http
  mvn spring-boot:run
```

#### Call then endpoint (can use postman or curl)

```http
  curl --location --request GET 'http://localhost:8080/upload' \
--form 'file=@"/home/zaidi/Desktop/test.txt"'
```

#### Should receive the answer in the api response (below is the example when using text.txt)
answer will me in map where key is line number and value is word count

```http
{
    "1": 1,
    "3": 3,
    "5": 3,
    "7": 3
}
```


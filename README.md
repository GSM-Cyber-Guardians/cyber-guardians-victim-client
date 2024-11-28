# Victim Server

## 사용 가이드

- `/` login 페이지
  - 브라우저로 8080 포트에 접근하면 로그인 페이지를 볼 수 있습니다.
  - 로그인 버튼 클릭시 `/login - POST` 요청으로 request body에 id, password 정보가 담겨 요청됩니다.
  - 로그인 이후에 home 페이지로 이동됩니다.
- `/home` home 페이지
  - 새로고침 할 때마다 서버에 HTTP ping 요청을 보내 응답 시간을 측정합니다. 만약 서버에서 문제가 발생한다면 에러 메시지가 출력됩니다. 

## 구동 방법


1. 빌드
```shell
./gradlew build
```

2. 도커 이미지 빌드
```shell
docker build -t victim . 
```

3. 도커 이미지 run
```shell
docker run -d --name victim -p 8080:8080 victim
```
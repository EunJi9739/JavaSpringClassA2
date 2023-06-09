# springA2_classB
오후반 스프링 조별 포트폴리오

## git mind 링크 : 링크: https://gitmind.com/app/docs/mebxr6jf 비밀번호: 2595

## 주제.

### 1. 온라인 쇼핑몰 웹사이트

    - 필요한 기능 : 메인페이지, 마이페이지(회원 정보 변경), 회원가입&로그인, 아이디&비밀번호 찾기, 메뉴 페이지, 메뉴 상세페이지(), 장바구니, 주문내역확인(조회), 결제 페이지, 결제완료 페이지 검색

    - 부가 기능 : , 상담||후기||퀴즈, 카테고리 나누기, 관리자페이지
               

## 2023/06/01
### 프론트 (main, header, footer) 만들기

### Log
- 개발 환경 설정
    - 의존성(spring initializr)
        - Spring Boot Devtools
        - Lombok
        - Spring Web
        - Thymeleaf
        - Spring Security
        - Spring Data JPA
        - Validation
        - H2 Database
        
    - 의존성(maven repository) 
        - ojdbc8
        - querydsl
        - ModelMapper
        - thymeleaf layout
    
    application.properties 
        - server.port
        - livereload
        - thymeleaf

- layouts - main 작성
- outlines - header, footer 작성

#### - 참고한 링크
<a href="https://github.com/yonggyo1125/springboard" target="_blank"><img src="https://img.shields.io/badge/github-181717?style=plastic&logo=github&logoColor=white"/></a>
=======


## 2023/06/03

### 프론트 (footer alert 스크립트 구현)

### Log

- SweetAlert2 외부 라이브러리 주입
- Footer에 이용약관, 개인정보취급방침 클릭시 alert() 발생 구현
- 외부 라이브러리를 이용해 alert 메세지 꾸미기


## 2023/06/04

### 프론트 (관리자 페이지)

### Log

- 관리자 페이지 html 파일 작성
- 공통 스타일 추가 (보완필요)

- 타임리프 기능 미구현


## 2023/06/05

### 프론트 (연동)

### Log

- yeounggeun 브랜치랑 연동


## 2023/06/07

### 프론트 (회원가입 페이지)

### Log

#### 프론트 구현
- Templates
    - Join.html 추가
    - Login.html 추가

#### 자바 클래스 구현
- commons
    - constants
        - MemberType
    - validators
        - MobileValidator
    
- controller.member
    - Address.java
    - JoinForm.java
    - JoinValidator.java
    - LoginForm.java

- entities
    - BaseEntity
    - Member

- models.member
    - JoinService
    - LoginFailureHandler
    - LoginSuccessHandler
    - LoginValidationException
    - MemberInfo
    - MemberInfoService

- [[*{address.addr1}]] 


## 2023/06/08

### 주소 Daum api 연동 구현

### *oAuth 인증 
- 제 3자를 통한 인증 (클라이언트와 서버가 서로 신뢰하지 못하기 때문에 믿을수 있는 oAuth를 이용해서 인증하는 방식)


## 2023/06/10

### Log

- 관리자 페이지 구현
- 로그인 회원가입 기능 구현

## 2023/06/12

### Log

- 관리자 페이지
    - main -> 관리자 페이지 이용 안내 script 구현

    - header -> 로고 추가

    - footer -> 약관 추가
        - 이용안내, 개인정보... -> script 구현


## 2023/06/13

### Log

- 에러페이지 커스텀
    - 이미지 추가
    - 폰트 추가
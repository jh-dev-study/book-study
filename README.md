## 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 - 이동욱 지음

![274966717](https://user-images.githubusercontent.com/50076031/103092075-69f9f080-4639-11eb-8d47-dc714b55713e.jpg)

### *01장 인텔리제이로 스프링 부트 시작하기*
  - 인텔리제이 소개
  - 인텔리제이 설치하기
  - 인텔리제이 커뮤니티에서 프로젝트 생성하기
  - 그레이들 프로젝트를 스프링 부트 프로젝트로 변경하기
  - 인텔리제이에서 깃과 깃허브 사용하기
  
  
### *02장 스프링 부트에서 테스트 코드를 작성하자*
  - 테스트 코드 소개
  - Hello Controller 테스트 코드 작성하기
  - 롬복 소개 및 설치하기
  - Hello Controller 코드를 롬복으로 전환하기
  
### *03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자*
  - JPA 소개
    - Spring Data JPA
    - 실무에서 JPA
    - 요구사항 분석
  - 프로젝트에 Spring Data Jpa 적용하기
  - Spring Data JPA 테스트 코드 작성하기
  - 등록/수정/조회 API 만들기
  - JPA Auditing으로 생성시간/수정시간 자동화하기
    - LocalDate 사용
    - JPA Auditing 테스트 코드 작성하기

### *04장 머스테치로 화면 구성하기*
  - 서버 템플릿 엔진과 머스테치 소개
    - 머스테치란
    - 머스테치 플러그인 설치
  - 기본 페이지 만들기
  - 게시글 등록 화면 만들기
  - 전체 조회 화면 만들기
  - 게시글 수정, 삭제 화면 만들기
    - 게시글 수정
    - 게시글 삭제
    
### *05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기*
  - 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트
  - 구글 서비스 등록
  - 구글 로그인 연동하기
    - 스프링 시큐리티 설정
    - 로그인 테스트
  - 어노테이션 기반으로 개선하기
  - 세션 저장소로 데이터베이스 사용하기
  - 네이버 로그인
    - 네이버 API 등록
    - 스프링 시큐리티 설정 등록
  - 기존 테스트에 시큐리티 적용하기
  
### *06장 AWS 서버 환경을 만들어보자 - AWS EC2*
  - AWS 회원 가입
  - EC2 인스턴스 생성하기
  - EC2 서버에 접속하기
  - 아마존 리눅스 1 서버 생성 시 꼭 해야 할 설정들

### *07장 AWS에 데이터베이스 환경을 만들어보자 - AWS RDS*
  - RDS 인스턴스 생성하기
  - RDS 운영환경에 맞는 파라미터 설정하기
  - 내 PC에서 RDS에 접속해 보기
    - Database 플러그인 설치
  - EC2에서 RDS에 접근 확인
  
### *08장 EC2 서버에 프로젝트를 배포해 보자*
  - EC2에 프로젝트 Clone 받기
  - 배포 스크립트 만들기
  - 외부 Security 파일 등록하기
  - 스프링 부트 프로젝트로 RDS 접근하기
    - RDS 테이블 생성
    - 프로젝트 설정
    - EC2 설정
  - EC2에서 소셜 로그인하기

### *09장 코드가 푸시되면 자동으로 배포해 보자 - Travis CI 배포 자동화*
  - CI & CD 소개
  - Travis CI 연동하기
    - Travis CI 웹 서비스 설정
    - 프로젝트 설정
  - Travis CI와 AWS S3 연동하기
    - AWS Key 발급
    - Travis CI에 키 등록
    - S3 버킷 생성
    - .travis.yml 추가
  - Travis CI와 AWS S3, CodeDeploy 연동하기
    - EC2에 IAM 역할 추가하기
    - CodeDeploy 에이전트 설치
    - CodeDeploy를 위한 권한 생성
    - CodeDeploy 생성
    - Travis CI, S3, CodeDeploy 연동
  - 배포 자동화 구성
    - deploy.sh 파일 추가
    - .travis.yml 파일 수정
    - appspec.yml 파일 수정
    - 실제 배포 과정 체험
  - CodeDeploy 로그 확인

### *10장 24시간 365일 중단 없는 서비스를 만들자*
  - 무중단 배포 소개
  - 엔진엑스(Ngnix) 설치와 스프링 부트 연동하기
  - 무중단 배포 스크립트 만들기
    - profile API 추가
    - real1, real2 profile 생성
    - 엔진엑스(Ngnix) 설정 수정
    - 배포 스크립트들 작성
  - 무중단 배포 테스트

### *1인 개발 시 도움이 될 도구와 조언들*
  - 추천 도구 소개
    - 댓글
    - 외부 서비스 연동
    - 방문자 분석
    - CDN
    - 이메일 마케팅
  - 1인 개발 팁
  - 마무리
  
- 찾아보기
  
  
  
  

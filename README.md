# 2022-2-OSSP1-Exit-1
2022-2학기 공개SW프로젝트 1팀 Exit 입니다 :)
<img src = "https://user-images.githubusercontent.com/89643634/208525117-f06e8cac-b7de-49f8-816a-298d73b96cac.png" width="5%" height="5%"><img src = "https://user-images.githubusercontent.com/89643634/208526489-d5d24a7d-d81c-4c62-a906-98fe84554920.png" width="4%" height="4%"><img src = "https://user-images.githubusercontent.com/89643634/208526454-828e2cfb-1137-4e11-93d5-3d09df7a862a.png" width="5%" height="5%"><img src = "https://user-images.githubusercontent.com/89643634/208526473-166945c0-7084-4052-9215-f212d1ecdb79.png" width="5%" height="5%">
## About Team


|이름|학과|역할|
|----|---|---|
|[안하영](https://github.com/ahnha-ahnha) [![](https://img.shields.io/badge/Github-ahnha-blue?style=flat-square&logo=Github)](https://github.com/ahnha-ahnha)|컴퓨터공학전공|팀장|
|[이석민](https://github.com/DrRivaski) [![](https://img.shields.io/badge/Github-DrRivaski-blue?style=flat-square&logo=Github)](https://github.com/DrRivaski)|컴퓨터공학전공|Backend|
|[이정수](https://github.com/Lee-JeongSoo) [![](https://img.shields.io/badge/Github-LeeJeongSoo-blue?style=flat-square&logo=Github)](https://github.com/Lee-JeongSoo)|컴퓨터공학전공|Frontend|
|[이다은](https://github.com/Dan2dani) [![](https://img.shields.io/badge/Github-Dan2dani-blue?style=flat-square&logo=Github)](https://github.com/Dan2dani)|컴퓨터공학전공|Frontend|

## 1. 프로젝트 주제
<div>
<h4> 방탈출 메이트 매칭 App
</div>     
    
## 2. 기술스택 & Workflow
Delishare(https://github.com/CSID-DGU/2022-1-OSSP1-Banana-4) & Kotlin & Android Studio<br>
<img width="10%" src="https://user-images.githubusercontent.com/89643634/208531596-621806b1-9212-49ce-a9d8-164e1500d5a9.png"/>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173768618-f9e968a8-1be8-486e-9cf9-0482e664ef9a.png"/>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173817432-ddb8a924-3e7e-4370-8ed7-79e019a4bf67.png"/>  
AWS & php & MariaDB & VS code & POSTMAN<br>
<img width="15%" src="https://user-images.githubusercontent.com/89643634/208532309-187ec6b6-e40f-43c2-8e35-adfb88a66937.png"/>
<img width="15%" src="https://user-images.githubusercontent.com/89643634/208532319-02745839-2af7-4567-9ce7-a2a668274b12.png"/>
<img width="15%" src="https://user-images.githubusercontent.com/89643634/208532326-aeb9b120-7a2d-4fad-bf9b-5a9fc2700138.png"/>  
<img width="15%" src="https://user-images.githubusercontent.com/89643634/208532340-f8007d4c-95e4-47b6-8ab6-f105cde207ce.jpg"/>
<img width="20%" src="https://user-images.githubusercontent.com/89643634/208532360-eba6989e-fc6f-4432-9080-f8a53d42b8d7.jpg"/>  
Figma & GitHub & Notion<br>
<img width="20%" src="https://user-images.githubusercontent.com/89643634/208532376-59ef8ea6-fec0-4254-a6ac-d45b3e81e2a5.png"/>
<img width="20%" src="https://user-images.githubusercontent.com/89643634/208532735-b5ce26d3-c87c-45b7-bbe2-764e2ab0e18d.jpg"/>
<img width="20%" src="https://user-images.githubusercontent.com/89643634/208532397-c4c26abb-af11-44d9-9d66-fa40987feb6b.png"/> 
    
## 3. 프로그램 구조도
<img width="70%" src="https://user-images.githubusercontent.com/89643634/208534979-df194b1b-4fdd-48d7-b528-7eb4c0c81df8.png"/>
    
## 4. 어플 소개
<img width="10%" src="https://user-images.githubusercontent.com/89643634/208537081-4e2f5e6f-ee65-47cb-b740-97d62e90ff05.png"/>
<h3>① Fun한 Matching<br>
② 스트레스 Punching<br>
③ 방탈출 쿠폰에 Punching</h3><br>

<h2> What's difference Between Delishare and Funching? </h2>

<h3> 변경점 ① : Domain 변경(배달음식 공동구매자 매칭 >>> 방탈출 메이트 매칭)<br>
변경점 ② : 실시간 매칭 >>> 조건에 맞는 여러 모임을 추천해주는 알고리즘<br>
<img width="50%" src="https://user-images.githubusercontent.com/89643634/208539453-3a2d48c9-b0a9-4e37-8b6c-8b08b8911b42.png"/><br>
개선점 ① : UX/UI 개선 - 이동성 개선, 디자인 통일, View 간의 구조 형성 <br>
개선점 ② : 구글사에서 제공하는 Firebase DB >>> Low Level DB(AWS+Maria DB)</h3><br>

<h3>(1) Login & Sign In</h3>

- 아이디와 비밀번호를 사용하여 로그인 >>> "로그인 성공"이라는 Toast Message <br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173760147-b5856c81-0647-45a6-9b13-dab5c4597f6d.png"/> <img width="20%" src="https://user-images.githubusercontent.com/87844641/173834290-7eb25c8a-6661-4605-b4ed-cc2d3fd51a26.png"/><br>

- 이름과 아이디, 비밀번호를 입력하여 회원가입<br>
- 필수항목 미입력, 아이디 중복, 비밀번호 오타 확인<br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173760479-a0da532b-d12f-4424-b720-34a21cf63740.png"/> <img width="20%" src="https://user-images.githubusercontent.com/87844641/173780458-e78af697-8741-429a-82f3-2f803e89718b.png"/><br>

<h3>(2) Matching - 방 만들기</h3>
    
- 방장의 매칭 조건 선택 : 날짜, 지역, 장르, 난이도, 공포도, 활동성<br>
- 추가 입력 자료 : 제목과 한 줄 소개<br>
<br><img width="20%" src="https://user-images.githubusercontent.com/87844641/173780852-0018d0cc-8e83-4278-a073-6a3b1569cd77.png"/>


<h3>(3) Matching - 찾아보기 </h3>
 
- 매칭 조건 선택 : 기간, 지역, 장르, 난이도, 공포도, 활동성<br>
- 존재하는 방 중 매칭 조건이 얼마나 충족되는지를 환산한 점수인 추천도 순으로 상위 3개 추천 <br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173843675-00376ab3-ad9e-4673-96ac-a3f6fe558f46.png"/><br>
    
<h3>(4) Chatting </h3>    
- 추천받은 방 중 원하는 방을 클릭하여 채팅 시작 >>> 구체적인 만남 정보 확정!<br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173847266-08adc6c6-de5e-43f1-bd4a-982012c0ef42.png"/><br>

<h3>(5) Category </h3>    
- DB의 방탈출 정보 출력<br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173847266-08adc6c6-de5e-43f1-bd4a-982012c0ef42.png"/><br>

<h3>(6) My page </h3>    
- 나의 프로필을 볼 수 있는 마이페이지 <br>
<img width="20%" src="https://user-images.githubusercontent.com/87844641/173847266-08adc6c6-de5e-43f1-bd4a-982012c0ef42.png"/><br>
    
## 5. 시연영상 
https://user-images.githubusercontent.com/87844641/173886505-0e7d574a-37ff-4041-a2b4-8168e83a9a99.mp4    

    
## 6. 노션 링크
[Notion](https://versed-fir-a6f.notion.site/Exit-_-88c95acb91b146f3a5aeb860dd18aaa6)

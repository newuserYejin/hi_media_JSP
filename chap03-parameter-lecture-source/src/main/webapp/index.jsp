<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Request Parameter</h1>
    <h3>GET 방식의 요청</h3>
    <hr>

    <h4>form 태그를 이용한 GET 방식 parameter</h4>

    <form action="querystring" method="get">
        <label>이름 :
            <input type="text" name="name">
        </label>
        <br>

        <label>나이 :
            <input type="number" name="age">
        </label>
        <br>

        <label>생일 :
            <input type="date" name="birthday">
        </label>
        <br>

        <label>성별 :
            <input type="radio" name="gender" id="male" value="m">
            <label for="male">남성</label>
            <input type="radio" name="gender" id="female" value="f">
            <label for="female">여성</label>
        </label>
        <br>

        <label>국적 : </label>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>

        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie">
        <label for="movie">영화</label>
        <input type="checkbox" name="hobbies" id="music" value="music">
        <label for="music">음악</label>
        <input type="checkbox" name="hobbies" id="coding" value="coding">
        <label for="coding">코딩</label>
        <br>

        <input type="submit" value="GET 요청">
    </form>

    <h4>a 태그의 href 속성에 직접 데이터 넣어서 get 요청</h4>
    <a href="querystring?name=asdf&age=33&birthday=2024-11-02&gender=f&national=ko&hobbies=movie&hobbies=music">
        쿼리스트링을 이용한 값 전달
    </a>

    <h4>from 태그를 이용한 POST 요청 처리</h4>

    <form action="formdata" method="post">
        <label>이름 :
            <input type="text" name="name">
        </label>
        <br>

        <label>나이 :
            <input type="number" name="age">
        </label>
        <br>

        <label>생일 :
            <input type="date" name="birthday">
        </label>
        <br>

        <label>성별 :
            <input type="radio" name="gender" id="male2" value="m">
            <label for="male2">남성</label>
            <input type="radio" name="gender" id="female2" value="f">
            <label for="female2">여성</label>
        </label>
        <br>

        <label>국적 : </label>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>

        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie2" value="movie">
        <label for="movie2">영화</label>
        <input type="checkbox" name="hobbies" id="music2" value="music">
        <label for="music2">음악</label>
        <input type="checkbox" name="hobbies" id="coding2" value="coding">
        <label for="coding2">코딩</label>
        <br>

        <input type="submit" value="POST 요청">
    </form>
</body>
</html>
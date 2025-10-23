const http = require('http');

http.createServer((req, res) => {
    // 응답 헤더 설정
    res.writeHead(200, { 'Content-Type': 'text/html; charset=UTF-8' });

    // HTML 응답 작성
    res.write("<h1>강다빈 입니다</h1>");
    res.write(`<div>url : ${req.url}</div>`);
    res.write(`<div>method : ${req.method}</div>`);
    res.write(`<div>headers : ${JSON.stringify(req.headers)}</div>`); //  JSON 문자열로 보기 좋게 보여준다
    res.write(`<div>httpVersion : ${req.httpVersion}</div>`);
    res.write(`<div>remoteAddress : ${req.socket.remoteAddress}</div>`); //  클라이언트 IP 확인
    res.write(`<div>headers['referer'] : ${req.headers['referer'] || '없음'}</div>`); // 안전한 출력

    // 응답 종료
    res.end("req 경로 종료");
})
.listen(80, () => {
    console.log("80번 포트 서버 실행 중, 대기 중...");
});

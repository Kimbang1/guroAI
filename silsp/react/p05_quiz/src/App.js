
import "./App.css";
import mysql from "mysql2"; //MySql 데이터 베이스를 node.js에서 사용할수 있도록 도와주는것

function App() {
  const connect = mysql.createConnection({
    host: "192.168.219.107", // AWS RDS 엔드포인트 (AWS가 아니라면 데이터베이스 드라이버가 접속할 데이터베이스의 주소)
    user: "root", // AWS RDS 계정 명
    password: "1234", // AWS RDS 비밀번호
    database: "loginPractice", // 연결할 MySQL DB 이름 ( 데이터베이스에 연결할 DB가 존재해야함 )
    port: 3306, // 기본값이 3306이라 설정하지 않아도 되지만 만약 변경이 있었다면 설정을 해주어야함
  });
  const app = express();
  const PORT = 3000;

  app.use(express.json());

  app.listen(PORT, () => {
    console.log(PORT, "포트로 서버가 열렸어요!");
  });
 
   return (
    
    
    
    
  );
}

export default App;

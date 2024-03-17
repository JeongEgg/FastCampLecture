package part1.ch4.model2;

public interface Connection {
    // 데이터베이스 연결동작
    public void getConnection(String url, String username, String password);
}

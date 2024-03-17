package part1.ch4.model2;

public class OracleDriver implements Connection{
    // OracleDriver는 Oracle 회사에서 만들어서 제공한다.(Driver)
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 oracle DB를 접속 시도한다.");
    }
}

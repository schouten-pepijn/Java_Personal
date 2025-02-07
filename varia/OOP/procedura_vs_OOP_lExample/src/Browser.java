public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHTTPRequest(ip);
    }
    
    // private methods
    private String sendHTTPRequest(String ip) {
        return "<html></html>";
    }
    // private methods
    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}

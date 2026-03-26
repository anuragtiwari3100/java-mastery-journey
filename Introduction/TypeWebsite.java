public class TypeWebsite {
    public static void main(String[] args) {
        // 👇 Change this value to test different URLs
        String url = "http://www.example.com";

        System.out.println("URL: " + url);

        // Extract protocol from the URL
        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

        // Extract domain extension
        String ext = url.substring(url.lastIndexOf(".") + 1);
        if (ext.equals("com"))
            System.out.println("Commercial");
        else if (ext.equals("org"))
            System.out.println("Organisation");
        else if (ext.equals("net"))
            System.out.println("Network");
    }
}

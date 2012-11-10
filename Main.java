public class Main {

  public static void main(String[] args) {

    String speech = "Four score and seven years ago";
    String[] result = speech.split("\\s");
    for (int x=0; x<result.length; x++) {
      System.out.println(result[x]);
    }

    String s = "Alvin:Alexander:Talkeetna:Alaska";
    result = s.split(":");
    for (int x=0; x<result.length; x++) {
      System.out.println(result[x]);
    }


  }

}



package igawa.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.StandardOpenOption;

public class Main {

  // 課題
  // 入出力を実際に実装して、作ったファイルに文章を追加する。
  // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして例外処理を行う。
  // catchした中で更にファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。
  public static void main(String[] args)  {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Yes,of course",StandardOpenOption.APPEND); //ここが動くとファイルができる 入出力処理は例外と隣り合わせ
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace(); //例外の内容をコンソール画面に表示する
      System.out.println("例外が発生した");
      try {
        Path path2 = Path.of("Exception.txt");
        Files.writeString(path2,"anything write",StandardOpenOption.APPEND);
        System.out.println(Files.readString(path2));
      }catch (IOException exception){
        exception.printStackTrace();
        System.out.println("null file");
      }
    }
  }
}
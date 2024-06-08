# exceptionnew


## 課題
1. 入出力を実際に実装して、作ったファイルに文章を追加する。
2. その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして例外処理を行う。
3. catchした中で更にファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。

## 出力結果
1. の出力画面
![image](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/be76f522-f8f2-4436-a770-939218d25cef)
2-3. の出力画面
![image](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/030a0110-8ba1-43a1-a19e-1ece638d8b17)
![image](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/b3d0e645-7435-400d-b23f-516710cbecb8)

### 一言メモ
1の出力画面で「Are you ready？」が2回繰り返して出力されたことについて、1回目の実行で文字化けエラー、2回目実行で出力結果表示となったため、プログラム内は2回実行していることになるため2回繰り返して出力されたと思われる。


## 修正
- 15行目のthrows IOExceptionを削除
- 27行目、28行目の変数名exceptione→exceptionに修正

## 出力結果
1. の出力画面
![exceptionnew1](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/d76b07ea-0c0a-4cac-98a6-78b7001e249e)
![image](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/a6d7f1ec-be87-4765-9f17-9942c3c7fc9e)
2-3. の出力画面
![exceptionnew3-1](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/3a4c6161-d81c-4de6-b8ce-ba6d64dcf86e)
![exceptionnew3-2](https://github.com/kuroninja-tatsurooo/exceptionnew/assets/157494201/f74377b9-35b3-4baa-86a2-a18fefcdc6e6)

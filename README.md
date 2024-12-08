# 環境構築

## nodebrew インストール

### nodebrew のインストール、PATHの設定をする

```bash
$ brew update
$ brew install nodebrew

$ echo 'export PATH=$HOME/.nodebrew/current/bin:$PATH' >> ~/.zshrc
$ source .zshrc
```

### nodebrew 用のディレクトリをセットアップする

```bash
$ /opt/homebrew/opt/nodebrew/bin/nodebrew setup_dirs
```

## Node.js と npm インストール

### インストール可能なバージョン確認する

```bash
$ nodebrew ls-remote
```

### 安定版をインストールする

```bash
$ nodebrew install stable
```

### バージョンを指定して node.js を使用する

```bash
$ nodebrew ls
v22.12.0

current: none

$ nodebrew use v22.12.0 
$ node -v
$ npm -v
```

node, npm のバージョンが表示されればインストールと使用設定が完了

## Appium サーバーインストール

### Appium サーバー を global インストールする

```bash
$ npm i -g appium
```

### Appium ドライバには uiAutometor2 をインストール

```bash
$ appium driver install uiautomator2
```


# Android　アプリのテスト

以下の動作がテストされるので、そのようなアプリのapkを用意する

- アプリトップ画面のButtonの数のログ出力
- 最初にのボタンのクリック
- クリック後のUI階層をログ出力

## apk を配置

プロジェクトルートに、<code>app-debug.apk</code>のファイル名で配置

## エミュレータを起動

エミュレータを起動して、デバイスIDが emulator-5554 であることを確認

```bash
$ adb devices
List of devices attached
emulator-5554   device
```

emulator-5554 ではない場合は、ソースコードの DriverDemo.kt ファイルの setUdid("emulator-5554") を表示されたデバイスIDで書き換える

## 実行

main() を実行する

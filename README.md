# VSCode Java Test 01.

## 目次

* [概要](#概要)
* [使い方](#使い方)
* [ライセンス](#ライセンス)
* [使用しているライブラリ](#使用しているライブラリ)

## 概要

launch.jsonで設定したメインの実行はモジュールが見つかるけど、  
settings.jsonで競って強いたテストの実行はモジュールが見つからないってことを示すためのプロジェクトです。

## 使い方

* 正常確認手順
	1. VSCodeJavaTest01.code-workspaceからVisual Studio Codeを起動する。
	1. エクスプローラーから、Test01を開く。
	1. 左のメニューからデバッグメニューを開いて、『Debug (Launch) - Current File』を実行する。
	1. TERMINALに『test』と表示される。

* 異常確認手順
	1. VSCodeJavaTest01.code-workspaceからVisual Studio Codeを起動する。
	1. エクスプローラーから、Test01Testsを開く。
	1. ファイル内のtestメソッド上部に表示されるRunを実行する。
	1. DEBUG CONSOLEに以下の通り表示される。
		> Error occurred during initialization of boot layer
		> java.lang.module.FindException: Module org.ainslec.picocog not found, required by jp.empressia.vscode_java_test
		
		※期待される出力は『test』。

* その他の正常確認手順（Gradle）
	1. VSCodeJavaTest01.code-workspaceからVisual Studio Codeを起動する。
	1. TERMINALで『./gradlew test』を実行する。
	1. build/reports/tests/test/index.htmlを開き、対象テストの標準出力を表示すると『test』が出力されている。

## ライセンス

いつも通りのライセンスです。  
zlibライセンス、MITライセンスでも利用できます。  

ただし、チーム（複数人）で使用する場合は、MITライセンスとしてください。  

## 使用しているライブラリ

* Picocog
	* https://github.com/ainslec/picocog

package jp.empressia.vscode_java_test_01;

import org.ainslec.picocog.PicoWriter;

/**
 * テスト用クラス。
 * @author すふぃあ
 */
public class Test01 {

	public static void main(String[] a) {
		String s = new Test01().test();
		System.out.println(s);
	}

	public String test() {
		PicoWriter writer = new PicoWriter();
		writer.writeln("test");

		String s = writer.toString();
		return s;
	}

}

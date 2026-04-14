import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }
  @Test
  void testPrintWithReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    ColorPrinter printer = new ColorPrinter(printStream);

    String message = "lorax I am";
    printer.print(message);


    String expectedOutput = ConsoleColor.WHITE + "lorax I am" + ConsoleColor.RESET;

    assertEquals(expectedOutput, outputStream.toString());
  }
  @Test
  void defaultColorIsWhite() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    ColorPrinter printer = new ColorPrinter(printStream);


    assertEquals(ConsoleColor.WHITE, printer.getCurrentColor());
  }
  @Test
  void ColorEndsAsBlue() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    ColorPrinter printer = new ColorPrinter(printStream);

    printer.setCurrentColor(ConsoleColor.BLACK);
    printer.setCurrentColor(ConsoleColor.BLUE);
    printer.setCurrentColor(ConsoleColor.YELLOW);
    printer.setCurrentColor(ConsoleColor.RESET);
    printer.setCurrentColor(ConsoleColor.GREEN);
    printer.setCurrentColor(ConsoleColor.BLUE);


    assertEquals(ConsoleColor.BLUE, printer.getCurrentColor());
  }
  @Test
  void testLong() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    ColorPrinter printer = new ColorPrinter(printStream);

    String message = "fsdgjoiewgredrahbrtmnjfsykmghmbhcgktykmygfyjfgsjntykytuyl8p98iulkst6yk5w6kjhgdjstfhjfztdjugcijfit urt urursburtbi768ofx iujfxtv iur6i 6 jstjy styjrtsuarduyyyy kuyo7yk7r6olui;loj.ih.hck gy irtistyut6bitik7yof8yjduyi5s6bwsr5qqyh5wrshj gnjhgkcmylnhfj,cyor67o7k7dtbit6ih7tydietdk8yylipo.\\l.;/['ioglyfkdtyiujr6styu5rsus54rbur6tnutdyibtyjfuykyfuufkbfiknfyiukbfyukyfhkygijdtidt6idt6ir5575e653y56ut6i8upk9upguhijt6cju5xr6j85rsd7h5rh7utdugdtu57di7r6rohr8yo8dtxbirx8nit6rbib56tdokitdoidtyoi67fyfjoi7fyjitjihe7bn t6utj87i7rty8t67j6t8rt787r6yi7yuidtyjiu5j8istus46r5wrrezterdty fhgnjmfuymoi7t8up,798tpm08yp;opu'u[l;jk,;hklgiugomyidr6tj6u6sru64un6u56tikdtyitycgidt6indt6idt6it6utcutimti7tyuvhgi7fyuhi7fy7u  y7idtyndtyjudtyut6hd6dtygjuhdt6udt6mi6t,o7yuo,yguouyghjift6yid8id6n8ni58i7ri7e6i76";
    printer.print(message);


    String expectedOutput = ConsoleColor.WHITE + "fsdgjoiewgredrahbrtmnjfsykmghmbhcgktykmygfyjfgsjntykytuyl8p98iulkst6yk5w6kjhgdjstfhjfztdjugcijfit urt urursburtbi768ofx iujfxtv iur6i 6 jstjy styjrtsuarduyyyy kuyo7yk7r6olui;loj.ih.hck gy irtistyut6bitik7yof8yjduyi5s6bwsr5qqyh5wrshj gnjhgkcmylnhfj,cyor67o7k7dtbit6ih7tydietdk8yylipo.\\l.;/['ioglyfkdtyiujr6styu5rsus54rbur6tnutdyibtyjfuykyfuufkbfiknfyiukbfyukyfhkygijdtidt6idt6ir5575e653y56ut6i8upk9upguhijt6cju5xr6j85rsd7h5rh7utdugdtu57di7r6rohr8yo8dtxbirx8nit6rbib56tdokitdoidtyoi67fyfjoi7fyjitjihe7bn t6utj87i7rty8t67j6t8rt787r6yi7yuidtyjiu5j8istus46r5wrrezterdty fhgnjmfuymoi7t8up,798tpm08yp;opu'u[l;jk,;hklgiugomyidr6tj6u6sru64un6u56tikdtyitycgidt6indt6idt6it6utcutimti7tyuvhgi7fyuhi7fy7u  y7idtyndtyjudtyut6hd6dtygjuhdt6udt6mi6t,o7yuo,yguouyghjift6yid8id6n8ni58i7ri7e6i76" + ConsoleColor.RESET;

    assertEquals(expectedOutput, outputStream.toString());
  }
  @Test
  void testNullCases() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    ColorPrinter printer = new ColorPrinter(printStream);

    String message = null;
    printer.print(message);


    String expectedOutput = ConsoleColor.WHITE + "null" + ConsoleColor.RESET;

    assertEquals(expectedOutput, outputStream.toString());
  }
}

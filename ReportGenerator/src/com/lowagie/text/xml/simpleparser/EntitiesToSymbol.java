package com.lowagie.text.xml.simpleparser;

import com.lowagie.text.Chunk;
import com.lowagie.text.Font;
import java.util.HashMap;

public class EntitiesToSymbol
{
  public static final HashMap map = new HashMap();

  public static Chunk get(String paramString, Font paramFont)
  {
    char c = getCorrespondingSymbol(paramString);
    if (c == 0)
      try
      {
        return new Chunk(String.valueOf((char)Integer.parseInt(paramString)), paramFont);
      }
      catch (Exception localException)
      {
        return new Chunk(paramString, paramFont);
      }
    Font localFont = new Font(3, paramFont.getSize(), paramFont.getStyle(), paramFont.getColor());
    return new Chunk(String.valueOf(c), localFont);
  }

  public static char getCorrespondingSymbol(String paramString)
  {
    Character localCharacter = (Character)map.get(paramString);
    if (localCharacter == null)
      return '\000';
    return localCharacter.charValue();
  }

  static
  {
    map.put("169", new Character('ã'));
    map.put("172", new Character('Ø'));
    map.put("174", new Character('Ò'));
    map.put("177", new Character('±'));
    map.put("215", new Character('´'));
    map.put("247", new Character('¸'));
    map.put("8230", new Character('¼'));
    map.put("8242", new Character('¢'));
    map.put("8243", new Character('²'));
    map.put("8260", new Character('¤'));
    map.put("8364", new Character('ð'));
    map.put("8465", new Character('Á'));
    map.put("8472", new Character('Ã'));
    map.put("8476", new Character('Â'));
    map.put("8482", new Character('Ô'));
    map.put("8501", new Character('À'));
    map.put("8592", new Character('¬'));
    map.put("8593", new Character('­'));
    map.put("8594", new Character('®'));
    map.put("8595", new Character('¯'));
    map.put("8596", new Character('«'));
    map.put("8629", new Character('¿'));
    map.put("8656", new Character('Ü'));
    map.put("8657", new Character('Ý'));
    map.put("8658", new Character('Þ'));
    map.put("8659", new Character('ß'));
    map.put("8660", new Character('Û'));
    map.put("8704", new Character('"'));
    map.put("8706", new Character('¶'));
    map.put("8707", new Character('$'));
    map.put("8709", new Character('Æ'));
    map.put("8711", new Character('Ñ'));
    map.put("8712", new Character('Î'));
    map.put("8713", new Character('Ï'));
    map.put("8717", new Character('\''));
    map.put("8719", new Character('Õ'));
    map.put("8721", new Character('å'));
    map.put("8722", new Character('-'));
    map.put("8727", new Character('*'));
    map.put("8729", new Character('·'));
    map.put("8730", new Character('Ö'));
    map.put("8733", new Character('µ'));
    map.put("8734", new Character('¥'));
    map.put("8736", new Character('Ð'));
    map.put("8743", new Character('Ù'));
    map.put("8744", new Character('Ú'));
    map.put("8745", new Character('Ç'));
    map.put("8746", new Character('È'));
    map.put("8747", new Character('ò'));
    map.put("8756", new Character('\\'));
    map.put("8764", new Character('~'));
    map.put("8773", new Character('@'));
    map.put("8776", new Character('»'));
    map.put("8800", new Character('¹'));
    map.put("8801", new Character('º'));
    map.put("8804", new Character('£'));
    map.put("8805", new Character('³'));
    map.put("8834", new Character('Ì'));
    map.put("8835", new Character('É'));
    map.put("8836", new Character('Ë'));
    map.put("8838", new Character('Í'));
    map.put("8839", new Character('Ê'));
    map.put("8853", new Character('Å'));
    map.put("8855", new Character('Ä'));
    map.put("8869", new Character('^'));
    map.put("8901", new Character('×'));
    map.put("8992", new Character('ó'));
    map.put("8993", new Character('õ'));
    map.put("9001", new Character('á'));
    map.put("9002", new Character('ñ'));
    map.put("913", new Character('A'));
    map.put("914", new Character('B'));
    map.put("915", new Character('G'));
    map.put("916", new Character('D'));
    map.put("917", new Character('E'));
    map.put("918", new Character('Z'));
    map.put("919", new Character('H'));
    map.put("920", new Character('Q'));
    map.put("921", new Character('I'));
    map.put("922", new Character('K'));
    map.put("923", new Character('L'));
    map.put("924", new Character('M'));
    map.put("925", new Character('N'));
    map.put("926", new Character('X'));
    map.put("927", new Character('O'));
    map.put("928", new Character('P'));
    map.put("929", new Character('R'));
    map.put("931", new Character('S'));
    map.put("932", new Character('T'));
    map.put("933", new Character('U'));
    map.put("934", new Character('F'));
    map.put("935", new Character('C'));
    map.put("936", new Character('Y'));
    map.put("937", new Character('W'));
    map.put("945", new Character('a'));
    map.put("946", new Character('b'));
    map.put("947", new Character('g'));
    map.put("948", new Character('d'));
    map.put("949", new Character('e'));
    map.put("950", new Character('z'));
    map.put("951", new Character('h'));
    map.put("952", new Character('q'));
    map.put("953", new Character('i'));
    map.put("954", new Character('k'));
    map.put("955", new Character('l'));
    map.put("956", new Character('m'));
    map.put("957", new Character('n'));
    map.put("958", new Character('x'));
    map.put("959", new Character('o'));
    map.put("960", new Character('p'));
    map.put("961", new Character('r'));
    map.put("962", new Character('V'));
    map.put("963", new Character('s'));
    map.put("964", new Character('t'));
    map.put("965", new Character('u'));
    map.put("966", new Character('f'));
    map.put("967", new Character('c'));
    map.put("9674", new Character('à'));
    map.put("968", new Character('y'));
    map.put("969", new Character('w'));
    map.put("977", new Character('J'));
    map.put("978", new Character('¡'));
    map.put("981", new Character('j'));
    map.put("982", new Character('v'));
    map.put("9824", new Character('ª'));
    map.put("9827", new Character('§'));
    map.put("9829", new Character('©'));
    map.put("9830", new Character('¨'));
    map.put("Alpha", new Character('A'));
    map.put("Beta", new Character('B'));
    map.put("Chi", new Character('C'));
    map.put("Delta", new Character('D'));
    map.put("Epsilon", new Character('E'));
    map.put("Eta", new Character('H'));
    map.put("Gamma", new Character('G'));
    map.put("Iota", new Character('I'));
    map.put("Kappa", new Character('K'));
    map.put("Lambda", new Character('L'));
    map.put("Mu", new Character('M'));
    map.put("Nu", new Character('N'));
    map.put("Omega", new Character('W'));
    map.put("Omicron", new Character('O'));
    map.put("Phi", new Character('F'));
    map.put("Pi", new Character('P'));
    map.put("Prime", new Character('²'));
    map.put("Psi", new Character('Y'));
    map.put("Rho", new Character('R'));
    map.put("Sigma", new Character('S'));
    map.put("Tau", new Character('T'));
    map.put("Theta", new Character('Q'));
    map.put("Upsilon", new Character('U'));
    map.put("Xi", new Character('X'));
    map.put("Zeta", new Character('Z'));
    map.put("alefsym", new Character('À'));
    map.put("alpha", new Character('a'));
    map.put("and", new Character('Ù'));
    map.put("ang", new Character('Ð'));
    map.put("asymp", new Character('»'));
    map.put("beta", new Character('b'));
    map.put("cap", new Character('Ç'));
    map.put("chi", new Character('c'));
    map.put("clubs", new Character('§'));
    map.put("cong", new Character('@'));
    map.put("copy", new Character('Ó'));
    map.put("crarr", new Character('¿'));
    map.put("cup", new Character('È'));
    map.put("dArr", new Character('ß'));
    map.put("darr", new Character('¯'));
    map.put("delta", new Character('d'));
    map.put("diams", new Character('¨'));
    map.put("divide", new Character('¸'));
    map.put("empty", new Character('Æ'));
    map.put("epsilon", new Character('e'));
    map.put("equiv", new Character('º'));
    map.put("eta", new Character('h'));
    map.put("euro", new Character('ð'));
    map.put("exist", new Character('$'));
    map.put("forall", new Character('"'));
    map.put("frasl", new Character('¤'));
    map.put("gamma", new Character('g'));
    map.put("ge", new Character('³'));
    map.put("hArr", new Character('Û'));
    map.put("harr", new Character('«'));
    map.put("hearts", new Character('©'));
    map.put("hellip", new Character('¼'));
    map.put("horizontal arrow extender", new Character('¾'));
    map.put("image", new Character('Á'));
    map.put("infin", new Character('¥'));
    map.put("int", new Character('ò'));
    map.put("iota", new Character('i'));
    map.put("isin", new Character('Î'));
    map.put("kappa", new Character('k'));
    map.put("lArr", new Character('Ü'));
    map.put("lambda", new Character('l'));
    map.put("lang", new Character('á'));
    map.put("large brace extender", new Character('ï'));
    map.put("large integral extender", new Character('ô'));
    map.put("large left brace (bottom)", new Character('î'));
    map.put("large left brace (middle)", new Character('í'));
    map.put("large left brace (top)", new Character('ì'));
    map.put("large left bracket (bottom)", new Character('ë'));
    map.put("large left bracket (extender)", new Character('ê'));
    map.put("large left bracket (top)", new Character('é'));
    map.put("large left parenthesis (bottom)", new Character('è'));
    map.put("large left parenthesis (extender)", new Character('ç'));
    map.put("large left parenthesis (top)", new Character('æ'));
    map.put("large right brace (bottom)", new Character('þ'));
    map.put("large right brace (middle)", new Character('ý'));
    map.put("large right brace (top)", new Character('ü'));
    map.put("large right bracket (bottom)", new Character('û'));
    map.put("large right bracket (extender)", new Character('ú'));
    map.put("large right bracket (top)", new Character('ù'));
    map.put("large right parenthesis (bottom)", new Character('ø'));
    map.put("large right parenthesis (extender)", new Character('÷'));
    map.put("large right parenthesis (top)", new Character('ö'));
    map.put("larr", new Character('¬'));
    map.put("le", new Character('£'));
    map.put("lowast", new Character('*'));
    map.put("loz", new Character('à'));
    map.put("minus", new Character('-'));
    map.put("mu", new Character('m'));
    map.put("nabla", new Character('Ñ'));
    map.put("ne", new Character('¹'));
    map.put("not", new Character('Ø'));
    map.put("notin", new Character('Ï'));
    map.put("nsub", new Character('Ë'));
    map.put("nu", new Character('n'));
    map.put("omega", new Character('w'));
    map.put("omicron", new Character('o'));
    map.put("oplus", new Character('Å'));
    map.put("or", new Character('Ú'));
    map.put("otimes", new Character('Ä'));
    map.put("part", new Character('¶'));
    map.put("perp", new Character('^'));
    map.put("phi", new Character('f'));
    map.put("pi", new Character('p'));
    map.put("piv", new Character('v'));
    map.put("plusmn", new Character('±'));
    map.put("prime", new Character('¢'));
    map.put("prod", new Character('Õ'));
    map.put("prop", new Character('µ'));
    map.put("psi", new Character('y'));
    map.put("rArr", new Character('Þ'));
    map.put("radic", new Character('Ö'));
    map.put("radical extender", new Character('`'));
    map.put("rang", new Character('ñ'));
    map.put("rarr", new Character('®'));
    map.put("real", new Character('Â'));
    map.put("reg", new Character('Ò'));
    map.put("rho", new Character('r'));
    map.put("sdot", new Character('×'));
    map.put("sigma", new Character('s'));
    map.put("sigmaf", new Character('V'));
    map.put("sim", new Character('~'));
    map.put("spades", new Character('ª'));
    map.put("sub", new Character('Ì'));
    map.put("sube", new Character('Í'));
    map.put("sum", new Character('å'));
    map.put("sup", new Character('É'));
    map.put("supe", new Character('Ê'));
    map.put("tau", new Character('t'));
    map.put("there4", new Character('\\'));
    map.put("theta", new Character('q'));
    map.put("thetasym", new Character('J'));
    map.put("times", new Character('´'));
    map.put("trade", new Character('Ô'));
    map.put("uArr", new Character('Ý'));
    map.put("uarr", new Character('­'));
    map.put("upsih", new Character('¡'));
    map.put("upsilon", new Character('u'));
    map.put("vertical arrow extender", new Character('½'));
    map.put("weierp", new Character('Ã'));
    map.put("xi", new Character('x'));
    map.put("zeta", new Character('z'));
  }
}

/* Location:           C:\xampp\htdocs\SuiteCRM\SuiteCRM-7.5.1\custom\modules\AOS_Contracts\ReportGenerator.jar
 * Qualified Name:     com.lowagie.text.xml.simpleparser.EntitiesToSymbol
 * JD-Core Version:    0.6.0
 */
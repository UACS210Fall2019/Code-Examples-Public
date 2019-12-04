import java.util.HashMap;
import java.util.Map;

public class E30Spellable {

    public static void main(String[] args) {
        Map<String, String> symbols = initSymbolsMap();
        System.out.println(symbols);

        System.out.println(isElementSpellable("began", symbols));
        System.out.println(isElementSpellable("feline", symbols));
        System.out.println(isElementSpellable("chemistry", symbols));
    }

    private static boolean isElementSpellable(String word,
            Map<String, String> symbols) {
        return false;
    }

    private static Map<String, String> initSymbolsMap() {
        return new HashMap<String, String>() {
            {
                put("h", "Hydrogen");
                put("he", "Helium");
                put("li", "Lithium");
                put("be", "Beryllium");
                put("b", "Boron");
                put("c", "Carbon");
                put("n", "Nitrogen");
                put("o", "Oxygen");
                put("f", "Fluorine");
                put("ne", "Neon");
                put("na", "Sodium");
                put("mg", "Magnesium");
                put("al", "Aluminum");
                put("si", "Silicon");
                put("p", "Phosphorus");
                put("s", "Sulfur");
                put("cl", "Chlorine");
                put("ar", "Argon");
                put("k", "Potassium");
                put("ca", "Calcium");
                put("sc", "Scandium");
                put("ti", "Titanium");
                put("v", "Vanadium");
                put("cr", "Chromium");
                put("mn", "Manganese");
                put("fe", "Iron");
                put("co", "Cobalt");
                put("ni", "Nickel");
                put("cu", "Copper");
                put("zn", "Zinc");
                put("ga", "Gallium");
                put("ge", "Germanium");
                put("as", "Arsenic");
                put("se", "Selenium");
                put("br", "Bromine");
                put("kr", "Krypton");
                put("rb", "Rubidium");
                put("sr", "Strontium");
                put("y", "Yttrium");
                put("zr", "Zirconium");
                put("nb", "Niobium");
                put("mo", "Molybdenum");
                put("tc", "Technetium");
                put("ru", "Ruthenium");
                put("rh", "Rhodium");
                put("pd", "Palladium");
                put("ag", "Silver");
                put("cd", "Cadmium");
                put("in", "Indium");
                put("sn", "Tin");
                put("sb", "Antimony");
                put("te", "Tellurium");
                put("i", "Iodine");
                put("xe", "Xenon");
                put("cs", "Cesium");
                put("ba", "Barium");
                put("la", "Lanthanum");
                put("ce", "Cerium");
                put("pr", "Praseodymium");
                put("nd", "Neodymium");
                put("pm", "Promethium");
                put("sm", "Samarium");
                put("eu", "Europium");
                put("gd", "Gadolinium");
                put("tb", "Terbium");
                put("dy", "Dysprosium");
                put("ho", "Holmium");
                put("er", "Erbium");
                put("tm", "Thulium");
                put("yb", "Ytterbium");
                put("lu", "Lutetium");
                put("hf", "Hafnium");
                put("ta", "Tantalum");
                put("w", "Tungsten");
                put("re", "Rhenium");
                put("os", "Osmium");
                put("ir", "Iridium");
                put("pt", "Platinum");
                put("au", "Gold");
                put("hg", "Mercury");
                put("tl", "Thallium");
                put("pb", "Lead");
                put("bi", "Bismuth");
                put("po", "Polonium");
                put("at", "Astatine");
                put("rn", "Radon");
                put("fr", "Francium");
                put("ra", "Radium");
                put("ac", "Actinium");
                put("th", "Thorium");
                put("pa", "Protactinium");
                put("u", "Uranium");
                put("np", "Neptunium");
                put("pu", "Plutonium");
                put("am", "Americium");
                put("cm", "Curium");
                put("bk", "Berkelium");
                put("cf", "Californium");
                put("es", "Einsteinium");
                put("fm", "Fermium");
                put("md", "Mendelevium");
                put("no", "Nobelium");
                put("lr", "Lawrencium");
                put("rf", "Rutherfordium");
                put("db", "Dubnium");
                put("sg", "Seaborgium");
                put("bh", "Bohrium");
                put("hs", "Hassium");
                put("mt", "Meitnerium");
                put("ds", "Darmstadtium");
                put("rg", "Roentgenium");
                put("cn", "Copernicium");
                put("nh", "Nihonium");
                put("fl", "Flerovium");
                put("mc", "Moscovium");
                put("lv", "Livermorium");
                put("ts", "Tennessine");
                put("og", "Oganesson");
            }
        };
    }

}

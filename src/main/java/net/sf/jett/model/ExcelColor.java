package net.sf.jett.model;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFColor;

/**
 * <p><code>Colors</code> represent the built-in color names that correspond
 * with Excel's indexed color scheme.  These are used in conjunction with
 * several property names defined for the style tag.  These color names do NOT
 * necessarily correspond with HTML/CSS standard color names.  Legal values are
 * the names of the enumeration objects, without underscores, case insensitive,
 * e.g. "center" == "Center" == "CENTER".</p>
 *
 * @author Randy Gettman
 * @since 0.4.0
 * @see net.sf.jett.tag.StyleTag
 * @see net.sf.jett.parser.StyleParser#PROPERTY_BORDER_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_BOTTOM_BORDER_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_LEFT_BORDER_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_RIGHT_BORDER_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_TOP_BORDER_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_FILL_BACKGROUND_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_FILL_FOREGROUND_COLOR
 * @see net.sf.jett.parser.StyleParser#PROPERTY_FONT_COLOR
 */
public enum ExcelColor
{
    AQUA               (new HSSFColor()                 , IndexedColors.AQUA                 , 51, 204, 204),
    AUTOMATIC          (new HSSFColor()            , IndexedColors.AUTOMATIC            , 0, 0, 0),
    BLACK              (new HSSFColor()                , IndexedColors.BLACK                , 0, 0, 0),
    BLUE               (new HSSFColor()                 , IndexedColors.BLUE                 , 0, 0, 255),
    BLUEGREY           (new HSSFColor()            , IndexedColors.BLUE_GREY            , 102, 102, 153),
    BRIGHTGREEN        (new HSSFColor()         , IndexedColors.BRIGHT_GREEN         , 0, 255, 0),
    BROWN              (new HSSFColor()                , IndexedColors.BROWN                , 153, 51, 0),
    CORAL              (new HSSFColor()                , IndexedColors.CORAL                , 255, 128, 128),
    CORNFLOWERBLUE     (new HSSFColor()      , IndexedColors.CORNFLOWER_BLUE      , 153, 153, 255),
    DARKBLUE           (new HSSFColor()            , IndexedColors.DARK_BLUE            , 0, 0, 128),
    DARKGREEN          (new HSSFColor()           , IndexedColors.DARK_GREEN           , 0, 51, 0),
    DARKRED            (new HSSFColor()             , IndexedColors.DARK_RED             , 128, 0, 0),
    DARKTEAL           (new HSSFColor()            , IndexedColors.DARK_TEAL            , 0, 51, 102),
    DARKYELLOW         (new HSSFColor()          , IndexedColors.DARK_YELLOW          , 128, 128, 0),
    GOLD               (new HSSFColor()                 , IndexedColors.GOLD                 , 255, 204, 0),
    GREEN              (new HSSFColor()                , IndexedColors.GREEN                , 0, 128, 0),
    GREY25PERCENT      (new HSSFColor()      , IndexedColors.GREY_25_PERCENT      , 192, 192, 192),
    GREY40PERCENT      (new HSSFColor()      , IndexedColors.GREY_40_PERCENT      , 150, 150, 150),
    GREY50PERCENT      (new HSSFColor()      , IndexedColors.GREY_50_PERCENT      , 128, 128, 128),
    GREY80PERCENT      (new HSSFColor()      , IndexedColors.GREY_80_PERCENT      , 51, 51, 51),
    INDIGO             (new HSSFColor()               , IndexedColors.INDIGO               , 51, 51, 153),
    LAVENDER           (new HSSFColor()             , IndexedColors.LAVENDER             , 204, 153, 255),
    LEMONCHIFFON       (new HSSFColor()        , IndexedColors.LEMON_CHIFFON        , 255, 255, 204),
    LIGHTBLUE          (new HSSFColor()           , IndexedColors.LIGHT_BLUE           , 51, 102, 255),
    LIGHTCORNFLOWERBLUE(new HSSFColor(), IndexedColors.LIGHT_CORNFLOWER_BLUE, 204, 204, 255),
    LIGHTGREEN         (new HSSFColor()          , IndexedColors.LIGHT_GREEN          , 204, 255, 204),
    LIGHTORANGE        (new HSSFColor()         , IndexedColors.LIGHT_ORANGE         , 255, 153, 0),
    LIGHTTURQUOISE     (new HSSFColor()      , IndexedColors.LIGHT_TURQUOISE      , 204, 255, 255),
    LIGHTYELLOW        (new HSSFColor()         , IndexedColors.LIGHT_YELLOW         , 255, 255, 153),
    LIME               (new HSSFColor()                 , IndexedColors.LIME                 , 153, 204, 0),
    MAROON             (new HSSFColor()               , IndexedColors.MAROON               , 128, 0, 0),
    OLIVEGREEN         (new HSSFColor()          , IndexedColors.OLIVE_GREEN          , 51, 51, 0),
    ORANGE             (new HSSFColor()               , IndexedColors.ORANGE               , 255, 102, 0),
    ORCHID             (new HSSFColor()               , IndexedColors.ORCHID               , 102, 0, 102),
    PALEBLUE           (new HSSFColor()            , IndexedColors.PALE_BLUE            , 153, 204, 255),
    PINK               (new HSSFColor()                 , IndexedColors.PINK                 , 255, 0, 255),
    PLUM               (new HSSFColor()                 , IndexedColors.PLUM                 , 153, 51, 102),
    RED                (new HSSFColor()                  , IndexedColors.RED                  , 255, 0, 0),
    ROSE               (new HSSFColor()                 , IndexedColors.ROSE                 , 255, 103, 204),
    ROYALBLUE          (new HSSFColor()           , IndexedColors.ROYAL_BLUE           , 0, 102, 204),
    SEAGREEN           (new HSSFColor()            , IndexedColors.SEA_GREEN            , 51, 153, 102),
    SKYBLUE            (new HSSFColor()             , IndexedColors.SKY_BLUE             , 0, 204, 255),
    TAN                (new HSSFColor()                  , IndexedColors.TAN                  , 255, 204, 153),
    TEAL               (new HSSFColor()                 , IndexedColors.TEAL                 , 0, 128, 128),
    TURQUOISE          (new HSSFColor()            , IndexedColors.TURQUOISE            , 0, 255, 255),
    VIOLET             (new HSSFColor()               , IndexedColors.VIOLET               , 128, 0, 128),
    WHITE              (new HSSFColor()                , IndexedColors.WHITE                , 255, 255, 255),
    YELLOW             (new HSSFColor()               , IndexedColors.YELLOW               , 255, 255, 0);

    /**
     * The "automatic" color in HSSF (.xls).
     * @since 0.9.1
     */
    public static final HSSFColor HSSF_COLOR_AUTOMATIC = new HSSFColor() ;

    /**
     * The color index used by comments in XSSF (.xlsx).
     * @since 0.10.0
     */
    public static final short XSSF_COLOR_COMMENT = 81;

    private HSSFColor myHssfColor;
    private XSSFColor myXssfColor;
    private IndexedColors myIndexedColor;
    private int myRed;
    private int myGreen;
    private int myBlue;

    private static HSSFColor[] hssfColors;

    static
    {
        hssfColors = new HSSFColor[65];
        for (ExcelColor excelColor : values())
        {
            HSSFColor hssfColor = excelColor.getHssfColor();
            hssfColors[hssfColor.getIndex()] = hssfColor;
        }
    }

    /**
     * Creates a <code>ExcelColor</code>.
     * @param hssfColor The <code>HSSFColor</code>.
     * @param indexedColor The <code>IndexedColor</code>.
     * @param red The red value, 0-255.
     * @param green The green value, 0-255.
     * @param blue The blue value, 0-255.
     */
    ExcelColor(HSSFColor hssfColor, IndexedColors indexedColor, int red, int green, int blue)
    {
        myHssfColor = hssfColor;
        myXssfColor = new XSSFColor(new byte[] {(byte) red, (byte) green, (byte) blue});
        myIndexedColor = indexedColor;
        myRed = red;
        myGreen = green;
        myBlue = blue;
    }

    /**
     * Return the <code>HSSFColor</code>.
     * @return The <code>HSSFColor</code>.
     */
    public HSSFColor getHssfColor()
    {
        return myHssfColor;
    }

    /**
     * Return the <code>XSSFColor</code>.
     * @return The <code>XSSFColor</code>.
     */
    public XSSFColor getXssfColor()
    {
        return myXssfColor;
    }

    /**
     * Returns the index.
     * @return The index.
     */
    public int getIndex()
    {
        return myIndexedColor.getIndex();
    }

    /**
     * Returns the <code>IndexedColors</code>.
     * @return The <code>IndexedColors</code>.
     */
    public IndexedColors getIndexedColor()
    {
        return myIndexedColor;
    }

    /**
     * Returns the red value, 0-255.
     * @return The red value, 0-255.
     */
    public int getRed()
    {
        return myRed;
    }

    /**
     * Returns the green value, 0-255.
     * @return The green value, 0-255.
     */
    public int getGreen()
    {
        return myGreen;
    }

    /**
     * Returns the blue value, 0-255.
     * @return The blue value, 0-255.
     */
    public int getBlue()
    {
        return myBlue;
    }

    /**
     * Returns the hex string, in the format "#RRGGBB".
     * @return The hex string, in the format "#RRGGBB".
     */
    public String getHexString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("#");

        String value = Integer.toHexString(myRed);
        if (value.length() == 1)
            builder.append("0");
        builder.append(value);

        value = Integer.toHexString(myGreen);
        if (value.length() == 1)
            builder.append("0");
        builder.append(value);

        value = Integer.toHexString(myBlue);
        if (value.length() == 1)
            builder.append("0");
        builder.append(value);

        return builder.toString();
    }

    /**
     * Returns the "distance" of the given RGB triplet from this color, as
     * defined by the sum of each of the differences for the red, green, and
     * blue values.
     * @param red The red value.
     * @param green The green value.
     * @param blue The blue value.
     * @return The sum of each of the differences for the red, green, and blue
     *    values.
     */
    public int distance(int red, int green, int blue)
    {
        return Math.abs(red - myRed) + Math.abs(green - myGreen) + Math.abs(blue - myBlue);
    }

    /**
     * Returns the color name, in all lowercase, no underscores or spaces.
     * @return The color name, in all lowercase, no underscores or spaces.
     */
    @Override
    public String toString()
    {
        return name().trim().toLowerCase().replace("_", "");
    }

    /**
     * Maps a short index color back to an <code>HSSFColor</code>.
     * @param index A short color index.
     * @return An <code>HSSFColor</code>.
     */
    public static HSSFColor getHssfColorByIndex(short index)
    {
        if (index == Font.COLOR_NORMAL || index == XSSF_COLOR_COMMENT)
        {
            return HSSF_COLOR_AUTOMATIC;
        }
        return hssfColors[index];
    }
}

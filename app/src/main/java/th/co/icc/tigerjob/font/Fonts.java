package th.co.icc.tigerjob.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 17/11/2559.
 */

public class Fonts
{
    private final Context context ;
    public final Typeface DEFAULT_THAI_FONTS;
    public final Typeface DEFAULT_THAI_FONTS_ITALIC;
    public final Typeface DEFAULT_THAI_FONTS_BOLD;
    public final Typeface DEFAULT_THAI_FONTS_LIGHT;
    public final Typeface DEFAULT_THAI_FONTS_LIGHT_ITALIC;

    public final Typeface CLOUD_LIGHT ;
    public final Typeface CLOUD_BOLD ;
    public final Typeface BOON_JOT;
    public final Typeface SUPERSPACE_BOLD_ITALIC;
    public final Typeface SUPERSPACE_BOLD_SLANT;
    public final Typeface SUPERSPACE_BOLD;
    public final Typeface SUPERSPACE_LIGHT_ITALIC;
    public final Typeface SUPERSPACE_LIGHT_SLANT;
    public final Typeface SUPERSPACE_LIGHT ;
    public final Typeface SUPERSPACE_REGULAR_SLANT ;
    public final Typeface SUPERSPACE_REGULAR_ITALIC ;
    public final Typeface SUPERSPACE_REGULAR  ;


    public final Typeface BOON_JOT_I;

    public Fonts(Context context)
    {
        this.context = context;
        BOON_JOT = Typeface.createFromAsset(context.getAssets(), "fonts/BoonJot-400.ttf");
        BOON_JOT_I = Typeface.createFromAsset(context.getAssets(), "fonts/BoonJot-400i.ttf");
        CLOUD_LIGHT = Typeface.createFromAsset(context.getAssets(), "fonts/Cloud-Light.otf");
        CLOUD_BOLD =  Typeface.createFromAsset(context.getAssets(), "fonts/Cloud-Bold.otf");
        SUPERSPACE_BOLD_ITALIC = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Bold Italic ver 1.00.ttf");
        SUPERSPACE_BOLD_SLANT = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Bold Slant ver 1.00.ttf");
        SUPERSPACE_BOLD = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Bold ver 1.00.ttf");
        SUPERSPACE_LIGHT_ITALIC = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Light Italic ver 1.00.ttf");
        SUPERSPACE_LIGHT_SLANT = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Light Slant ver 1.00.ttf");
        SUPERSPACE_LIGHT = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Light ver 1.00.ttf");
        SUPERSPACE_REGULAR_ITALIC = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Regular Italic ver 1.00.ttf");
        SUPERSPACE_REGULAR_SLANT = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Regular ver 1.00 Slant.ttf");
        SUPERSPACE_REGULAR = Typeface.createFromAsset(context.getAssets(), "fonts/Superspace Regular ver 1.00.ttf");


        DEFAULT_THAI_FONTS = Typeface.createFromAsset(context.getAssets(), "fonts/prompt/Prompt-Regular.ttf");
        DEFAULT_THAI_FONTS_ITALIC = Typeface.createFromAsset(context.getAssets(), "fonts/prompt/Prompt-Italic.ttf");
        DEFAULT_THAI_FONTS_BOLD = Typeface.createFromAsset(context.getAssets(), "fonts/prompt/Prompt-Bold.ttf");
        DEFAULT_THAI_FONTS_LIGHT = Typeface.createFromAsset(context.getAssets(), "fonts/prompt/Prompt-Light.ttf");
        DEFAULT_THAI_FONTS_LIGHT_ITALIC = Typeface.createFromAsset(context.getAssets(), "fonts/prompt/Prompt-LightItalic.ttf");
    }


    public void overrideFonts(final Context context, final View v , Typeface font)
    {
        try
        {
            if (v instanceof ViewGroup)
            {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++)
                {
                    View child = vg.getChildAt(i);
                    overrideFonts(context, child , font);
                }
            }
            else if (v instanceof TextView)
            {
                ((TextView) v).setTypeface(font);
            }
        }
        catch (Exception e)
        {
            Log.e("ERROR_FONTS" , e.toString());
        }
    }

}

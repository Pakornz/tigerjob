package th.co.icc.tigerjob.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import th.co.icc.tigerjob.R;

public class InputDialog
{

    public interface OnSubmitInput
    {
        void onSubmit(String value);
    }

    private final Activity activity;
    private final View dialogView;
    private final  AlertDialog.Builder dialogBuilder ;
    private final AlertDialog alertDialog;

    private TextView titleTV;
    private TextInputEditText textInputEditText;
    private Button submitBtn , cancelBtn;



    public InputDialog(Activity activity)
    {
        this.activity = activity;

        dialogBuilder = new AlertDialog.Builder(activity);
        LayoutInflater inflater =  activity.getLayoutInflater();
        dialogView = inflater.inflate(R.layout.dialog_input, null);
        dialogBuilder.setView(dialogView);

        titleTV =  dialogView.findViewById(R.id.title);
        textInputEditText = (TextInputEditText) ( (TextInputLayout) dialogView.findViewById(R.id.input_layout)).getEditText();
        if (textInputEditText != null)
        {
            textInputEditText.setSingleLine();
        }
        alertDialog = dialogBuilder.create();

        if(alertDialog.getWindow()  != null)
            alertDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;

        submitBtn = dialogView.findViewById(R.id.submit_btn);
        cancelBtn = dialogView.findViewById(R.id.cancel_btn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener)
    {

        alertDialog.setOnDismissListener(onDismissListener);
    }

    public void setOnSubmitInput(final OnSubmitInput onSubmitInput)
    {
        submitBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onSubmitInput.onSubmit(String.valueOf(textInputEditText.getText()));
            }
        });
    }

    public void setInputHint(String hint)
    {
        textInputEditText.setHint(String.valueOf(hint));
    }

    public void setInputType(int inputType)
    {
        textInputEditText.setInputType(inputType);
    }

    public void setValue(String value)
    {
        textInputEditText.setText(String.valueOf(value));
    }

    public void setTitle(String title)
    {
        dialogView.findViewById(R.id.header_container).setVisibility(View.VISIBLE);
        titleTV.setText(String.valueOf(title));
    }

    public void dismiss()
    {
        alertDialog.dismiss();
    }

    public void show()
    {
        alertDialog.show();
    }


    public void setInputLines(int lines)
    {
        if(lines == 1)
        {
            textInputEditText.setSingleLine();

        }
        else
        {
            textInputEditText.setSingleLine(false);
            textInputEditText.setLines(lines);
            textInputEditText.setMaxLines(lines);

        }

    }

}

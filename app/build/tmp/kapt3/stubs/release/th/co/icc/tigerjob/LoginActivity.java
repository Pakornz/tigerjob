package th.co.icc.tigerjob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0012\u0010&\u001a\u00020\u001d2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u001dH\u0002J\u0006\u0010*\u001a\u00020\u001dJ\b\u0010+\u001a\u00020\u001dH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lth/co/icc/tigerjob/LoginActivity;", "Lth/co/icc/tigerjob/BaseActivity;", "()V", "aListAdapter", "Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter;", "getAListAdapter", "()Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter;", "setAListAdapter", "(Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter;)V", "callApi", "Lth/co/icc/tigerjob/api/Service;", "linear", "Landroid/widget/LinearLayout;", "prefixx", "Lth/co/icc/tigerjob/database/modelrealm/Prefix;", "showButton", "", "text_prefix_id", "Landroid/widget/TextView;", "value", "", "wCopyRightTV", "wLoginButton", "Landroid/widget/Button;", "wTextInputPassword", "Landroid/support/v7/widget/AppCompatEditText;", "wTextInputUsername", "wVersionTextView", "bindViews", "", "callListPrefix", "getCopyright", "context", "Landroid/content/Context;", "getVersionName", "goToMenu", "isAuthorized", "login", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setEvents", "showSelectTypeDialog", "updateUI", "SelectTypeListAdapter", "app_release"})
public final class LoginActivity extends th.co.icc.tigerjob.BaseActivity {
    private android.support.v7.widget.AppCompatEditText wTextInputUsername;
    private android.support.v7.widget.AppCompatEditText wTextInputPassword;
    private android.widget.Button wLoginButton;
    private android.widget.TextView wCopyRightTV;
    private android.widget.TextView wVersionTextView;
    private android.widget.TextView text_prefix_id;
    private android.widget.LinearLayout linear;
    private java.lang.String value;
    private boolean showButton;
    private th.co.icc.tigerjob.database.modelrealm.Prefix prefixx;
    @org.jetbrains.annotations.NotNull()
    public th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter aListAdapter;
    private th.co.icc.tigerjob.api.Service callApi;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter getAListAdapter() {
        return null;
    }
    
    public final void setAListAdapter(@org.jetbrains.annotations.NotNull()
    th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindViews() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCopyright(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final void updateUI() {
    }
    
    private final void setEvents() {
    }
    
    public final void showSelectTypeDialog() {
    }
    
    private final boolean isAuthorized() {
        return false;
    }
    
    private final void login() {
    }
    
    private final void callListPrefix() {
    }
    
    private final void goToMenu() {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$TypeViewHolder;", "()V", "onVideoClick", "Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$OnVideoClick;", "getOnVideoClick", "()Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$OnVideoClick;", "setOnVideoClick", "(Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$OnVideoClick;)V", "selectedPosition", "", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "typeList", "", "Lth/co/icc/tigerjob/api/modelapi/ListPrefix$DatasBean;", "getTypeList", "()Ljava/util/List;", "setTypeList", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnVideoClick", "TypeViewHolder", "app_release"})
    public static final class SelectTypeListAdapter extends android.support.v7.widget.RecyclerView.Adapter<th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.TypeViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<? extends th.co.icc.tigerjob.api.modelapi.ListPrefix.DatasBean> typeList;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer selectedPosition;
        @org.jetbrains.annotations.Nullable()
        private th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.OnVideoClick onVideoClick;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<th.co.icc.tigerjob.api.modelapi.ListPrefix.DatasBean> getTypeList() {
            return null;
        }
        
        public final void setTypeList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends th.co.icc.tigerjob.api.modelapi.ListPrefix.DatasBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSelectedPosition() {
            return null;
        }
        
        public final void setSelectedPosition(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.OnVideoClick getOnVideoClick() {
            return null;
        }
        
        public final void setOnVideoClick(@org.jetbrains.annotations.Nullable()
        th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.OnVideoClick p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.TypeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        th.co.icc.tigerjob.LoginActivity.SelectTypeListAdapter.TypeViewHolder holder, int position) {
        }
        
        public SelectTypeListAdapter() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$OnVideoClick;", "", "onClickUser", "", "type", "Lth/co/icc/tigerjob/api/modelapi/ListPrefix$DatasBean;", "app_release"})
        public static abstract interface OnVideoClick {
            
            public abstract void onClickUser(@org.jetbrains.annotations.NotNull()
            th.co.icc.tigerjob.api.modelapi.ListPrefix.DatasBean type);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lth/co/icc/tigerjob/LoginActivity$SelectTypeListAdapter$TypeViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "wSelected", "Landroid/widget/ImageView;", "getWSelected", "()Landroid/widget/ImageView;", "wTypeCard", "Landroid/support/v7/widget/CardView;", "getWTypeCard", "()Landroid/support/v7/widget/CardView;", "wTypeName", "Landroid/widget/TextView;", "getWTypeName", "()Landroid/widget/TextView;", "wTypePrefix", "getWTypePrefix", "app_release"})
        public static final class TypeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypePrefix = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.TextView wTypeName = null;
            @org.jetbrains.annotations.NotNull()
            private final android.widget.ImageView wSelected = null;
            @org.jetbrains.annotations.NotNull()
            private final android.support.v7.widget.CardView wTypeCard = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypePrefix() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getWTypeName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.ImageView getWSelected() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.support.v7.widget.CardView getWTypeCard() {
                return null;
            }
            
            public TypeViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View v) {
                super(null);
            }
        }
    }
}
// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.main.friendlist;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendsMsgboxFragment_ViewBinding implements Unbinder {
  private FriendsMsgboxFragment target;

  private View view2131296454;

  private View view2131296502;

  @UiThread
  public FriendsMsgboxFragment_ViewBinding(final FriendsMsgboxFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.fly_kakao_bg, "field 'ui_flyKakaoBg' and method 'OnClickKakaoBg'");
    target.ui_flyKakaoBg = Utils.castView(view, R.id.fly_kakao_bg, "field 'ui_flyKakaoBg'", FrameLayout.class);
    view2131296454 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickKakaoBg();
      }
    });
    target.ui_rcvContents = Utils.findRequiredViewAsType(source, R.id.rcv_contents, "field 'ui_rcvContents'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.imv_kakao, "method 'OnClickKakaoLogin'");
    view2131296502 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClickKakaoLogin();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendsMsgboxFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_flyKakaoBg = null;
    target.ui_rcvContents = null;

    view2131296454.setOnClickListener(null);
    view2131296454 = null;
    view2131296502.setOnClickListener(null);
    view2131296502 = null;
  }
}

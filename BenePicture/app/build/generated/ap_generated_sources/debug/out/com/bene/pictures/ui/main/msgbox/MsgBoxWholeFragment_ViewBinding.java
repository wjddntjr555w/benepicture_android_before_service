// Generated code from Butter Knife. Do not modify!
package com.bene.pictures.ui.main.msgbox;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bene.pictures.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MsgBoxWholeFragment_ViewBinding implements Unbinder {
  private MsgBoxWholeFragment target;

  @UiThread
  public MsgBoxWholeFragment_ViewBinding(MsgBoxWholeFragment target, View source) {
    this.target = target;

    target.ui_rcvContents = Utils.findRequiredViewAsType(source, R.id.rcv_contents, "field 'ui_rcvContents'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MsgBoxWholeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ui_rcvContents = null;
  }
}

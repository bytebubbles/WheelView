package com.cncoderx.wheelview;

/**
 * @author cncoderx
 */
public interface OnWheelChangedListener {
    void onChanged(WheelView view, int oldIndex, int newIndex);

    void onStateChange(WheelView mWheelView, boolean release, boolean stop);
}

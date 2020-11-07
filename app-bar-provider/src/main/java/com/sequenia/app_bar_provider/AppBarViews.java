package com.sequenia.app_bar_provider;

import android.view.ViewGroup;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;

public interface AppBarViews {
    AppBarLayout getAppBar();
    MaterialToolbar getToolbar();
    ViewGroup getCollapsingContent();
    CollapsingToolbarLayout getCollapsingToolbarLayout();
}

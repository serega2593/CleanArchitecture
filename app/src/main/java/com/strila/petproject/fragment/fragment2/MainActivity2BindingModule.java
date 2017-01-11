package com.strila.petproject.fragment.fragment2;

import com.strila.petproject.di.fragment.FragmentComponentBuilder;
import com.strila.petproject.di.fragment.FragmentKey;
import com.strila.petproject.fragment.fragment1.Fragment1;
import com.strila.petproject.fragment.fragment1.Fragment1Component;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Serhii Strila on 1/11/17
 */

@Module(
        subcomponents = {
                Fragment1Component.class,
                Fragment2Component.class
        })
public abstract class MainActivity2BindingModule {

    @Binds
    @IntoMap
    @FragmentKey(Fragment1.class)
    public abstract FragmentComponentBuilder fragment1ComponentBuilder(Fragment1Component.Builder impl);

    @Binds
    @IntoMap
    @FragmentKey(Fragment2.class)
    public abstract FragmentComponentBuilder fragment2ComponentBuilder(Fragment2Component.Builder impl);
}
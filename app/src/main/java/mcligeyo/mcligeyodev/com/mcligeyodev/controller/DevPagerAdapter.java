package mcligeyo.mcligeyodev.com.mcligeyodev.controller;

//import androidx.core.app.Fragment;
//import androidx.core.app.FragmentManager;
//import androidx.core.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import mcligeyo.mcligeyodev.com.mcligeyodev.views.AboutFragment;
import mcligeyo.mcligeyodev.com.mcligeyodev.views.ContactFragment;
import mcligeyo.mcligeyodev.com.mcligeyodev.views.SkillsFragment;
import mcligeyo.mcligeyodev.com.mcligeyodev.views.WorkFragment;





public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";
        }
        return null;
    }
}

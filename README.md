# ProgramaticFragment



public void containerTabs(){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        for (int i = 0; i < al.size(); i++) {

            LinearLayout ln = (LinearLayout) this.findViewById(R.id.buttonPanel);
            final Button btn = new Button(this);
            btn.setId(i);
            final int id_ = btn.getId();
            LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams( 235 , 120);
            btnParams.setMargins(10, 0, 10, 0);
            btnParams.gravity = Gravity.CENTER;
            btn.setText(al.get(i).toString());
            btn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            btn.setGravity(Gravity.CENTER);
            btn.setTextColor(getResources().getColor(R.color.white));
            btn.setBackgroundResource(R.drawable.tab_button);

            if(i==0){
                btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                btn.setBackgroundResource(R.drawable.tab_button_selected);
            }else{
                btn.setTextColor(getResources().getColor(R.color.white));
                btn.setBackgroundResource(R.drawable.tab_button);
            }
            String fragmentTitle = al.get(i).toString();
            final int f = i;

            adapter.addFragment(new CustomFragment(), fragmentTitle);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button b;
                    for(int a=0; a<al.size(); a++ ){
                        b = findViewById(a);
                        b.setTextColor(getResources().getColor(R.color.white));
                        b.setBackgroundResource(R.drawable.tab_button);
                    }
                    btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    btn.setBackgroundResource(R.drawable.tab_button_selected);
                    mViewPager.setCurrentItem(f, true);
                }
            });

            ln.addView(btn, btnParams);

        }
        mViewPager.setAdapter(adapter);
        mViewPager.setPagingEnabled(false);
    }

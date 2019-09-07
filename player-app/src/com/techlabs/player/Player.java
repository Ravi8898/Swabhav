package com.techlabs.player;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player(int id, String name) {

		this(id, name, 18);

	}

	public Player(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Player whoIsElder(Player p) {

		if (p.getAge() > this.getAge()) {
			return p;
		}

		return this;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
    @Override
	public String toString() {
    	String superClass=super.toString();
		return "id:" + id + ", " + "name:" + name + ", " + "age:" + age+" "+superClass;

	}
    @Override
    public boolean equals(Object p2) {
    	Player p22=(Player)p2;
    	if((this.id!=p22.getId()) || this.name!=p22.getName() || this.age!=p22.getAge())
    		return false;
    	return true;
    }

}
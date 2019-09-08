package com.altafjava.constructorreference;

class World {
	public World() {
		System.out.println("World class, object creattion");
	}
}

interface Interf {
	World getWorld();
}

public class Test {

	public static void main(String[] args) {
		// usinf lamda expression
		Interf i = () -> {
			World world = new World();
			return world;
		};
		World world = i.getWorld();
		System.out.println("using lamda expression= " + world);

		// using method reference
		Interf interf = World::new;
		World world2 = interf.getWorld();
		System.out.println("using method reference= " + world2);
	}
}

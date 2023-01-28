class MySingleton {

	private static MySingleton mySingleton = null;

	//  Make private constructor(To prevent object creation outside)
	private MySingleton() {}

	// Create static function to return instance of Singleton class
	public static MySingleton getInstance() {
		// null check
		if (mySingleton == null) {
			// use synchronized block for thread safty
			synchronized(MySingleton.class) {
				// double null check
				if (mySingleton == null) {
					mySingleton = new MySingleton();
				}
			}
		}

		return mySingleton;
	}
}
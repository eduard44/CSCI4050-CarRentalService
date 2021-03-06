/**
 * This class is generated by jOOQ
 */
package edu.uga.csci4050.group3.jooq.team3.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RentalLocationRecord extends org.jooq.impl.UpdatableRecordImpl<edu.uga.csci4050.group3.jooq.team3.tables.records.RentalLocationRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -38185727;

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.uid</code>. 
	 */
	public void setUid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.uid</code>. 
	 */
	public java.lang.String getUid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.street_address</code>. 
	 */
	public void setStreetAddress(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.street_address</code>. 
	 */
	public java.lang.String getStreetAddress() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.state</code>. 
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.country</code>. 
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.zipcode</code>. 
	 */
	public void setZipcode(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.zipcode</code>. 
	 */
	public java.lang.Integer getZipcode() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.city</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.city</code>. 
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>team3.RENTAL_LOCATION.capacity</code>. 
	 */
	public void setCapacity(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>team3.RENTAL_LOCATION.capacity</code>. 
	 */
	public java.lang.Integer getCapacity() {
		return (java.lang.Integer) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.UID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.STREET_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.ZIPCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION.CAPACITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getStreetAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getZipcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getCapacity();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RentalLocationRecord
	 */
	public RentalLocationRecord() {
		super(edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION);
	}

	/**
	 * Create a detached, initialised RentalLocationRecord
	 */
	public RentalLocationRecord(java.lang.Integer id, java.lang.String uid, java.lang.String name, java.lang.String streetAddress, java.lang.String state, java.lang.String country, java.lang.Integer zipcode, java.lang.String city, java.lang.Integer capacity) {
		super(edu.uga.csci4050.group3.jooq.team3.tables.RentalLocation.RENTAL_LOCATION);

		setValue(0, id);
		setValue(1, uid);
		setValue(2, name);
		setValue(3, streetAddress);
		setValue(4, state);
		setValue(5, country);
		setValue(6, zipcode);
		setValue(7, city);
		setValue(8, capacity);
	}
}

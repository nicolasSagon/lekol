package com.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cycle database table.
 * 
 */
@Entity
@NamedQuery(name="Cycle.findAll", query="SELECT c FROM Cycle c")
public class Cycle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to Level
	@OneToMany(mappedBy="cycle")
	private List<Level> levels;

	public Cycle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Level> getLevels() {
		return this.levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

	public Level addLevel(Level level) {
		getLevels().add(level);
		level.setCycle(this);

		return level;
	}

	public Level removeLevel(Level level) {
		getLevels().remove(level);
		level.setCycle(null);

		return level;
	}

}
package com.controllers;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

import com.entities.Activity;
import com.entities.Class;
import com.models.CustomEvent;
import com.services.ActivityService;
import com.services.ClassService;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ScheduleController implements Serializable{

	private ScheduleModel eventModel;
	@EJB
	private ClassService classService;
 
    private CustomEvent event = new CustomEvent();
    
    @EJB
    private ActivityService service;
    
    public int selectedClassId;
    
    public int getSelectedClassId() {
		return selectedClassId;
	}

	public void setSelectedClassId(int selectedClassId) {
		this.selectedClassId = selectedClassId;
	}

	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}

	public void chooseClass(int classId) {

        event = new CustomEvent();
    	List<Activity> lstActivity = service.getAllActivities(classId);
        eventModel = new DefaultScheduleModel();
        for (Activity a : lstActivity)  {
        	CustomEvent e = new CustomEvent(a.getName(), a.getStartDate(), a.getEndDate(), a.getTeacher(), a.getClazz(), a.getRoom(), a.getId());  
        	eventModel.addEvent(e);
        }
    	
    }
    
    public ScheduleController() {

        eventModel = new DefaultScheduleModel();
    }
	
    /*
    @PostConstruct
    public void init() {
        eventModel = new DefaultScheduleModel();
        Teacher teacher = new Teacher();
        teacher.setFirstName("Ben");
        teacher.setLastName("Lacroix");
        Class classe = new Class();
        Level level = new Level();
        Cycle cycle = new Cycle();
        cycle.setName("cycle");
        level.setName("CM1");
        classe.setLevel(level);
        Date random = getRandomDate(new Date());
        eventModel.addEvent(new CustomEvent("Custom Event 1", previousDay8Pm(), previousDay11Pm(), teacher, classe));
        eventModel.addEvent(new CustomEvent("Custom Event 2", today1Pm(), today6Pm(), teacher, classe));
        eventModel.addEvent(new CustomEvent("Custom Event 3", nextDay9Am(), nextDay11Am(), teacher, classe));
        eventModel.addEvent(new CustomEvent("Custom Event 4", theDayAfter3Pm(), fourDaysLater3pm(), teacher, classe));
        lazyEventModel = new LazyScheduleModel() {
             
            @Override
            public void loadEvents(Date start, Date end) {
                Date random = getRandomDate(start);
                Teacher teacher = new Teacher();
                teacher.setFirstName("Ben");
                teacher.setLastName("Lacroix");
                Class classe = new Class();
                Level level = new Level();
                Cycle cycle = new Cycle();
                cycle.setName("cycle");
                level.setName("level");
                classe.setLevel(level);
                addEvent(new CustomEvent("LazyEvent 1", random, random, teacher, new Class()));
                 
                random = getRandomDate(start);
                addEvent(new CustomEvent("LazyEvent 2", random, random, teacher, new Class()));
            }   
        };
    }
    
    public Date getRandomDate(Date base) {
        Calendar date = Calendar.getInstance();
        date.setTime(base);
        date.add(Calendar.DATE, ((int) (Math.random()*30)) + 1);    //set random day of month
         
        return date.getTime();
    }
     
    public Date getInitialDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), Calendar.FEBRUARY, calendar.get(Calendar.DATE), 0, 0, 0);
         
        return calendar.getTime();
    }*/
     
    public ScheduleModel getEventModel() {
        return eventModel;
    }
    
    public ScheduleEvent getEvent() {
        return event;
    }
 
    public void setEvent(CustomEvent event) {
        this.event = event;
    }
     
    public void addEvent(ActionEvent actionEvent) {
    	Activity a = newActivity(event);
    	
        if(event.getId() == null) {
        	event.setActivityId(service.addActivity(a));
            eventModel.addEvent(event);	
        }
        else {
        	service.saveActivity(a);
            eventModel.updateEvent(event);
        }
         
        event = new CustomEvent();
    }
    
    public void deleteEvent(ActionEvent actionEvent){
    	
    	service.deleteActivity(event.getActivityId());
    	eventModel.deleteEvent(event);
    	event = new CustomEvent();
    
    }
     
    public void onEventSelect(SelectEvent selectEvent) {
        event = (CustomEvent) selectEvent.getObject();
    }
     
    public void onDateSelect(SelectEvent selectEvent) {
    	Class classe = classService.getById(selectedClassId);
        event = new CustomEvent("", (Date) selectEvent.getObject(), (Date) selectEvent.getObject(), classe.getTeacher() , classe, classe.getRoom(), 0);
    }
     
    public void onEventMove(ScheduleEntryMoveEvent event) {
    	service.saveActivity(newActivity((CustomEvent)event.getScheduleEvent()));
    }
     
    public void onEventResize(ScheduleEntryResizeEvent event) {
        service.saveActivity(newActivity((CustomEvent)event.getScheduleEvent()));
    }
    
    private Activity newActivity(CustomEvent e){
    	Activity a = new Activity();
        a.setName(e.getTitle());
    	a.setRoom(e.getRoom());
    	a.setTeacher(e.getTeacher());
    	a.setStartDate(e.getStartDate());
    	a.setEndDate(e.getEndDate());
    	a.setClazz(e.getClasse());
    	a.setId(e.getActivityId());
    	return a;
    }
	
}




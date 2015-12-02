package com.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

import com.entities.Cycle;
import com.entities.Level;
import com.entities.Teacher;
import com.entities.Class;
import com.models.CustomEvent;
import com.services.ActivityService;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ScheduleController implements Serializable{

	private ScheduleModel eventModel;
    
    private ScheduleModel lazyEventModel;
 
    private CustomEvent event = new CustomEvent();
    
    private ActivityService service;
    
    public void chooseClass(int classId) {
    	
    	//List<Activity> lstActivity = service.getListActivityByClassId(classId);
    	
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
     
    public ScheduleModel getLazyEventModel() {
        return lazyEventModel;
    }
    
    public ScheduleEvent getEvent() {
        return event;
    }
 
    public void setEvent(CustomEvent event) {
        this.event = event;
    }
     
    public void addEvent(ActionEvent actionEvent) {
        if(event.getId() == null)
            eventModel.addEvent(event);
        else
            eventModel.updateEvent(event);
         
        event = new CustomEvent();
    }
     
    public void onEventSelect(SelectEvent selectEvent) {
        event = (CustomEvent) selectEvent.getObject();
    }
     
    public void onDateSelect(SelectEvent selectEvent) {
        event = new CustomEvent("", (Date) selectEvent.getObject(), (Date) selectEvent.getObject(), (Teacher) selectEvent.getObject(),(Class) selectEvent.getObject());
    }
     
    public void onEventMove(ScheduleEntryMoveEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());
         
        addMessage(message);
    }
     
    public void onEventResize(ScheduleEntryResizeEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());
         
        addMessage(message);
    }
     
    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
}




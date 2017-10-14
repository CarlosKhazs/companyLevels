package States;

import Observers.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlos on 12/10/17.
 */
public class CompanyStateFactory {
    private static List<Observer> observers = new ArrayList<>();

    private static void callNotifiers() {
        observers.forEach(Observer::notifyWhenCompanyGrows);
    }

    private static void addObserver(Observer observer) {
        observers.add(observer);
    }

    public static CompanyState getState(int employeesNumber) {
        observers.clear();

        if (employeesNumber > 500) {
            Observer observerStaff = new Staff();
            Observer observerEntireCompany = new EntireCompany();
            Observer observerCommunicationMedia = new CommunicationMedia();

            addObserver(observerStaff);
            addObserver(observerEntireCompany);
            addObserver(observerCommunicationMedia);

            callNotifiers();
            return new Multinational();
        } else if (employeesNumber > 89 && employeesNumber < 489) {
            Observer observerStaff = new Staff();
            Observer observerEntireCompany = new EntireCompany();

            addObserver(observerStaff);
            addObserver(observerEntireCompany);

            callNotifiers();
            return new Enterprise();
        } else {
            Observer observerStaff = new Staff();

            addObserver(observerStaff);

            callNotifiers();
            return new Startup();
        }
    }
}

class Badge {
    public String print(Integer id, String name, String department) {
        String idString = id == null ? "" : "["+id+"] - ";
        String departmentString = department == null ? " - OWNER" : " - "+department.toUpperCase();

        return idString + name + departmentString;
    }
}
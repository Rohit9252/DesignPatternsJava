package adapterPattern;

public class AssignmentWork {

        private Pen p;

        public void setP(Pen p) {
            this.p = p;
        }

        private Pen getP() {
            return p;
        }

        public void writeAssignment(String str) {
            p.write(str);

        }
}

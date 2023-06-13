package kr.or.ddit.notice.vo;


public class Paging {
    private int page = 1;
    private int totalCount;
    private int beginRow;
    private int endRow;
    private int beginPage;
    private int endPage;
    private int displayRow = 10;
    private int displayPage = 2;
    boolean prev;
    boolean next;

    public Paging() {
    }

    public int getBeginRow() {
        return this.beginRow;
    }

    public void setBeginRow(int beginRow) {
        this.beginRow = beginRow;
    }

    public int getEndRow() {
        return this.endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.paging();
    }

    public int getBeginPage() {
        return this.beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getEndPage() {
        return this.endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getDisplayRow() {
        return this.displayRow;
    }

    public void setDisplayRow(int displayRow) {
        this.displayRow = displayRow;
    }

    public int getDisplayPage() {
        return this.displayPage;
    }

    public void setDisplayPage(int displayPage) {
        this.displayPage = displayPage;
    }

    public boolean isPrev() {
        return this.prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }

    public boolean isNext() {
        return this.next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    private void paging() {
        this.endPage = (int)Math.ceil((double)this.page / (double)this.displayPage) * this.displayPage;
        System.out.println("endPage : " + this.endPage);
        this.beginPage = this.endPage - (this.displayPage - 1);
        System.out.println("beginPage : " + this.beginPage);
        int totalPage = (int)Math.ceil((double)this.totalCount / (double)this.displayRow);
        if (totalPage < this.endPage) {
            this.endPage = totalPage;
            this.next = false;
        } else {
            this.next = true;
        }

        this.prev = this.beginPage != 1;
        System.out.println("endPage : " + this.endPage);
        System.out.println("totalPage : " + totalPage);
        this.endRow = this.displayRow * this.page;
        this.beginRow = this.endRow - (this.displayRow - 1);
    }
}
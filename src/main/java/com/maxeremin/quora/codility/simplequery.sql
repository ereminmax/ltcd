SELECT inv_num, sum(price) from invoice_items group by inv_num order by inv_num;